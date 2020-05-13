/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.ClientCertMetadataDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.PaginationDTO;

/**
 * Representation of a list of client certificates
 */
@ApiModel(description = "Representation of a list of client certificates")

public class ClientCertificatesDTO {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("certificates")
  private List<ClientCertMetadataDTO> certificates = null;

  @SerializedName("pagination")
  private PaginationDTO pagination = null;

  public ClientCertificatesDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ClientCertificatesDTO certificates(List<ClientCertMetadataDTO> certificates) {
    this.certificates = certificates;
    return this;
  }

  public ClientCertificatesDTO addCertificatesItem(ClientCertMetadataDTO certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @ApiModelProperty(value = "")
  public List<ClientCertMetadataDTO> getCertificates() {
    return certificates;
  }

  public void setCertificates(List<ClientCertMetadataDTO> certificates) {
    this.certificates = certificates;
  }

  public ClientCertificatesDTO pagination(PaginationDTO pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public PaginationDTO getPagination() {
    return pagination;
  }

  public void setPagination(PaginationDTO pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientCertificatesDTO clientCertificates = (ClientCertificatesDTO) o;
    return Objects.equals(this.count, clientCertificates.count) &&
        Objects.equals(this.certificates, clientCertificates.certificates) &&
        Objects.equals(this.pagination, clientCertificates.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, certificates, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientCertificatesDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
