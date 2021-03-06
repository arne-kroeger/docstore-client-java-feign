/*
 * docstore API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@docstore.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.docstore.documentation.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.docstore.documentation.api.model.Environment;
import dev.docstore.documentation.api.model.Space;
import dev.docstore.documentation.api.model.TemplateVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TemplateData
 */
@JsonPropertyOrder({
  TemplateData.JSON_PROPERTY_UUID,
  TemplateData.JSON_PROPERTY_SPACE,
  TemplateData.JSON_PROPERTY_ENVIRONMENT,
  TemplateData.JSON_PROPERTY_ADDITIONAL_TAGS,
  TemplateData.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-26T07:34:15.178+02:00[Europe/Berlin]")
public class TemplateData {
  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_SPACE = "space";
  private Space space;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private Environment environment;

  public static final String JSON_PROPERTY_ADDITIONAL_TAGS = "additionalTags";
  private List<String> additionalTags = null;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private List<TemplateVariable> variables = new ArrayList<>();


  public TemplateData uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TemplateData space(Space space) {
    
    this.space = space;
    return this;
  }

   /**
   * Get space
   * @return space
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SPACE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Space getSpace() {
    return space;
  }


  public void setSpace(Space space) {
    this.space = space;
  }


  public TemplateData environment(Environment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Environment getEnvironment() {
    return environment;
  }


  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }


  public TemplateData additionalTags(List<String> additionalTags) {
    
    this.additionalTags = additionalTags;
    return this;
  }

  public TemplateData addAdditionalTagsItem(String additionalTagsItem) {
    if (this.additionalTags == null) {
      this.additionalTags = new ArrayList<>();
    }
    this.additionalTags.add(additionalTagsItem);
    return this;
  }

   /**
   * Get additionalTags
   * @return additionalTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdditionalTags() {
    return additionalTags;
  }


  public void setAdditionalTags(List<String> additionalTags) {
    this.additionalTags = additionalTags;
  }


  public TemplateData variables(List<TemplateVariable> variables) {
    
    this.variables = variables;
    return this;
  }

  public TemplateData addVariablesItem(TemplateVariable variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TemplateVariable> getVariables() {
    return variables;
  }


  public void setVariables(List<TemplateVariable> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateData templateData = (TemplateData) o;
    return Objects.equals(this.uuid, templateData.uuid) &&
        Objects.equals(this.space, templateData.space) &&
        Objects.equals(this.environment, templateData.environment) &&
        Objects.equals(this.additionalTags, templateData.additionalTags) &&
        Objects.equals(this.variables, templateData.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, space, environment, additionalTags, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateData {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    additionalTags: ").append(toIndentedString(additionalTags)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

