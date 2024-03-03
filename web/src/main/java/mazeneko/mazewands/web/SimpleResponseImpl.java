package mazeneko.mazewands.web;

import java.util.Objects;

record SimpleResponseImpl(String message) implements SimpleResponse {
  SimpleResponseImpl {
    Objects.requireNonNull(message);
  }
}
