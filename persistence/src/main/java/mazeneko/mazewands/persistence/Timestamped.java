package mazeneko.mazewands.persistence;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * タイムスタンプ付きのエンティティです。
 */
public interface Timestamped<ENTITY extends Timestamped<ENTITY>> {
  /**
   * 作成日を返します。
   * 
   * @return 作成日
   */
  Optional<LocalDateTime> createdAt();

  /**
   * 更新日を返します。
   * 
   * @return 更新日
   */
  Optional<LocalDateTime> updatedAt();

  /**
   * 作成日を変更したエンティティを返します。
   * 
   * @param newValue 新しい作成日の値
   * @return 変更したエンティティ
   */
  ENTITY withCreatedAt(LocalDateTime newValue);

  /**
   * 更新日を変更したエンティティを返します。
   * 
   * @param newValue 新しい更新日の値
   * @return 変更したエンティティ
   */
  ENTITY withUpdatedAt(LocalDateTime newValue);
}
