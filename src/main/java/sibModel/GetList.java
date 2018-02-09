/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class GetList {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("totalBlacklisted")
  private Long totalBlacklisted = null;

  @SerializedName("totalSubscribers")
  private Long totalSubscribers = null;

  public GetList id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the list
   * @return id
  **/
  @ApiModelProperty(example = "23", required = true, value = "ID of the list")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the list
   * @return name
  **/
  @ApiModelProperty(example = "Magento Customers - EN", required = true, value = "Name of the list")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetList totalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
    return this;
  }

   /**
   * Number of blacklisted contacts in the list
   * @return totalBlacklisted
  **/
  @ApiModelProperty(example = "13", required = true, value = "Number of blacklisted contacts in the list")
  public Long getTotalBlacklisted() {
    return totalBlacklisted;
  }

  public void setTotalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
  }

  public GetList totalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
    return this;
  }

   /**
   * Number of contacts in the list
   * @return totalSubscribers
  **/
  @ApiModelProperty(example = "1776", required = true, value = "Number of contacts in the list")
  public Long getTotalSubscribers() {
    return totalSubscribers;
  }

  public void setTotalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetList getList = (GetList) o;
    return ObjectUtils.equals(this.id, getList.id) &&
    ObjectUtils.equals(this.name, getList.name) &&
    ObjectUtils.equals(this.totalBlacklisted, getList.totalBlacklisted) &&
    ObjectUtils.equals(this.totalSubscribers, getList.totalSubscribers);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, totalBlacklisted, totalSubscribers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalBlacklisted: ").append(toIndentedString(totalBlacklisted)).append("\n");
    sb.append("    totalSubscribers: ").append(toIndentedString(totalSubscribers)).append("\n");
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
