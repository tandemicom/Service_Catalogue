package TANDEM.icomtelecom.service_catalogue.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;


import java.util.Objects;

/**
 * This type represents the general information of a MEC service.
 */
//@Schema(description = "This type represents the general information of a MEC service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-15T15:58:59.394Z[GMT]")


public class Service {
  @Id
  @JsonProperty("serInstanceId")
  private String serInstanceId = null;

  @JsonProperty("serName")
  private String serName = null;

  @JsonProperty("serCategory")
  private CategoryRef serCategory = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("state")
  private ServiceState state = null;
//
  @JsonProperty("transportInfo")
  private TransportInfo transportInfo = null;
//
  @JsonProperty("serializer")
  private SerializerType serializer = null;
//
  @JsonProperty("scopeOfLocality")
  private LocalityType scopeOfLocality = null;

  @JsonProperty("consumedLocalOnly")
  private Boolean consumedLocalOnly = null;

  @JsonProperty("isLocal")
  private Boolean isLocal = null;

  @JsonProperty("piEdgeInfo")
  private piEdgeInfo piEdgeInfo = null;

  public Boolean getConsumedLocalOnly() {
    return consumedLocalOnly;
  }

  public Boolean getLocal() {
    return isLocal;
  }

  public void setLocal(Boolean local) {
    isLocal = local;
  }

  public TANDEM.icomtelecom.service_catalogue.Model.piEdgeInfo getPiEdgeInfo() {
    return piEdgeInfo;
  }

  public void setPiEdgeInfo(TANDEM.icomtelecom.service_catalogue.Model.piEdgeInfo piEdgeInfo) {
    this.piEdgeInfo = piEdgeInfo;
  }

  public Service serInstanceId(String serInstanceId) {
    this.serInstanceId = serInstanceId;
    return this;
  }

  /**
   * Identifier of the service instance assigned by the MEC platform.
   * @return serInstanceId
   **/
//  @Schema(description = "Identifier of the service instance assigned by the MEC platform.")
  
    public String getSerInstanceId() {
    return serInstanceId;
  }

  public void setSerInstanceId(String serInstanceId) {
    this.serInstanceId = serInstanceId;
  }

  public Service serName(String serName) {
    this.serName = serName;
    return this;
  }

  /**
   * The name of the service. This is how the service producing MEC application identifies the service instance it produces.
   * @return serName
   **/
//  @Schema(required = true, description = "The name of the service. This is how the service producing MEC application identifies the service instance it produces.")
//      @NotNull

    public String getSerName() {
    return serName;
  }

  public void setSerName(String serName) {
    this.serName = serName;
  }

//  public ServiceInfo serCategory(CategoryRef serCategory) {
//    this.serCategory = serCategory;
//    return this;
//  }

  /**
   * Get serCategory
   * @return serCategory
   **/
//  @Schema(description = "")
  
//    @Valid
    public CategoryRef getSerCategory() {
    return serCategory;
  }

  public void setSerCategory(CategoryRef serCategory) {
    this.serCategory = serCategory;
  }

  public Service version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Service version
   * @return version
   **/
//  @Schema(required = true, description = "Service version")
//      @NotNull

    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

//  public ServiceInfo state(ServiceState state) {
//    this.state = state;
//    return this;
//  }

  /**
   * Get state
   * @return state
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public ServiceState getState() {
    return state;
  }
//
  public void setState(ServiceState state) {
    this.state = state;
  }

  public Service transportInfo(TransportInfo transportInfo) {
    this.transportInfo = transportInfo;
    return this;
  }

  /**
   * Get transportInfo
   * @return transportInfo
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public TransportInfo getTransportInfo() {
    return transportInfo;
  }
//
  public void setTransportInfo(TransportInfo transportInfo) {
    this.transportInfo = transportInfo;
  }
//
  public Service serializer(SerializerType serializer) {
    this.serializer = serializer;
    return this;
  }

  /**
   * Get serializer
   * @return serializer
   **/
//  @Schema(required = true, description = "")
//      @NotNull
//
//    @Valid
    public SerializerType getSerializer() {
    return serializer;
  }
//
  public void setSerializer(SerializerType serializer) {
    this.serializer = serializer;
  }
//
  public Service scopeOfLocality(LocalityType scopeOfLocality) {
    this.scopeOfLocality = scopeOfLocality;
    return this;
  }

  /**
   * Get scopeOfLocality
   * @return scopeOfLocality
   **/
//  @Schema(description = "")
//
//    @Valid
    public LocalityType getScopeOfLocality() {
    return scopeOfLocality;
  }
//
  public void setScopeOfLocality(LocalityType scopeOfLocality) {
    this.scopeOfLocality = scopeOfLocality;
  }

  public Service consumedLocalOnly(Boolean consumedLocalOnly) {
    this.consumedLocalOnly = consumedLocalOnly;
    return this;
  }

  /**
   * Indicate whether the service can only be consumed by the MEC applications located in the same locality (as defined by scopeOfLocality) as this  service instance.
   * @return consumedLocalOnly
   **/
//  @Schema(description = "Indicate whether the service can only be consumed by the MEC applications located in the same locality (as defined by scopeOfLocality) as this  service instance.")
  
    public Boolean isConsumedLocalOnly() {
    return consumedLocalOnly;
  }

  public void setConsumedLocalOnly(Boolean consumedLocalOnly) {
    this.consumedLocalOnly = consumedLocalOnly;
  }

  public Service isLocal(Boolean isLocal) {
    this.isLocal = isLocal;
    return this;
  }

  /**
   * Indicate whether the service is located in the same locality (as defined by scopeOfLocality) as the consuming MEC application.
   * @return isLocal
   **/
//  @Schema(description = "Indicate whether the service is located in the same locality (as defined by scopeOfLocality) as the consuming MEC application.")
  
    public Boolean isIsLocal() {
    return isLocal;
  }

  public void setIsLocal(Boolean isLocal) {
    this.isLocal = isLocal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.serInstanceId, service.serInstanceId) &&
        Objects.equals(this.serName, service.serName) &&
        Objects.equals(this.serCategory, service.serCategory) &&
        Objects.equals(this.version, service.version) &&
        Objects.equals(this.state, service.state) &&
        Objects.equals(this.transportInfo, service.transportInfo) &&
        Objects.equals(this.serializer, service.serializer) &&
        Objects.equals(this.scopeOfLocality, service.scopeOfLocality) &&
        Objects.equals(this.consumedLocalOnly, service.consumedLocalOnly) &&
        Objects.equals(this.isLocal, service.isLocal);
  }

//  @Override
//  public int hashCode() {
//    return Objects.hash(serInstanceId, serName, serCategory, version, state, transportInfo, serializer, scopeOfLocality, consumedLocalOnly, isLocal);
//  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfo {\n");
    
    sb.append("    serInstanceId: ").append(toIndentedString(serInstanceId)).append("\n");
    sb.append("    serName: ").append(toIndentedString(serName)).append("\n");
    sb.append("    serCategory: ").append(toIndentedString(serCategory)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transportInfo: ").append(toIndentedString(transportInfo)).append("\n");
    sb.append("    serializer: ").append(toIndentedString(serializer)).append("\n");
    sb.append("    scopeOfLocality: ").append(toIndentedString(scopeOfLocality)).append("\n");
    sb.append("    consumedLocalOnly: ").append(toIndentedString(consumedLocalOnly)).append("\n");
    sb.append("    isLocal: ").append(toIndentedString(isLocal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
