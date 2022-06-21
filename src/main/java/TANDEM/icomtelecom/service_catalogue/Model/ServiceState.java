package TANDEM.icomtelecom.service_catalogue.Model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This enumeration defines the possible states of a service.
 */
public enum ServiceState {
  ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");

  private String value;

  ServiceState(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ServiceState fromValue(String text) {
    for (ServiceState b : ServiceState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
