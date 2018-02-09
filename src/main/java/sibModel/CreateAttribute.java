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
import java.util.ArrayList;
import java.util.List;
import sibModel.CreateAttributeEnumeration;

/**
 * CreateAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-15T11:12:00.535+05:30")
public class CreateAttribute {
  @SerializedName("value")
  private String value = null;

  @SerializedName("enumeration")
  private List<CreateAttributeEnumeration> enumeration = null;

  /**
   * Type of the attribute. Use only if the attribute&#39;s category is normal, category or transactional ( type &#39;id&#39; only available if the category is &#39;transactional&#39; attribute &amp; type &#39;category&#39; only available if the category is &#39;category&#39; attribute )
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    DATE("date"),
    
    FLOAT("float"),
    
    ID("id"),
    
    CATEGORY("category");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public CreateAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute. Use only if the attribute&#39;s category is calculated or global
   * @return value
  **/
  @ApiModelProperty(example = "COUNT[BLACKLISTED,BLACKLISTED,<,NOW()]", value = "Value of the attribute. Use only if the attribute's category is calculated or global")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public CreateAttribute enumeration(List<CreateAttributeEnumeration> enumeration) {
    this.enumeration = enumeration;
    return this;
  }

  public CreateAttribute addEnumerationItem(CreateAttributeEnumeration enumerationItem) {
    if (this.enumeration == null) {
      this.enumeration = new ArrayList<CreateAttributeEnumeration>();
    }
    this.enumeration.add(enumerationItem);
    return this;
  }

   /**
   * Values that the attribute can take. Use only if the attribute&#39;s category is category
   * @return enumeration
  **/
  @ApiModelProperty(value = "Values that the attribute can take. Use only if the attribute's category is category")
  public List<CreateAttributeEnumeration> getEnumeration() {
    return enumeration;
  }

  public void setEnumeration(List<CreateAttributeEnumeration> enumeration) {
    this.enumeration = enumeration;
  }

  public CreateAttribute type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the attribute. Use only if the attribute&#39;s category is normal, category or transactional ( type &#39;id&#39; only available if the category is &#39;transactional&#39; attribute &amp; type &#39;category&#39; only available if the category is &#39;category&#39; attribute )
   * @return type
  **/
  @ApiModelProperty(example = "text", value = "Type of the attribute. Use only if the attribute's category is normal, category or transactional ( type 'id' only available if the category is 'transactional' attribute & type 'category' only available if the category is 'category' attribute )")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    CreateAttribute createAttribute = (CreateAttribute) o;
    return ObjectUtils.equals(this.value, createAttribute.value) &&
    ObjectUtils.equals(this.enumeration, createAttribute.enumeration) &&
    ObjectUtils.equals(this.type, createAttribute.type);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(value, enumeration, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAttribute {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enumeration: ").append(toIndentedString(enumeration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
