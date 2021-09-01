package ru.vlapin.experiments.springbootdemo100.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Limitations:
 * - no defaults (!!!)
 */
@Getter
@ConstructorBinding
@RequiredArgsConstructor
@ConfigurationProperties("mail.credentials")
public final class AnnotationBasedImmutablePropertiesPlaceholderExample {

  /**
   * Auth method
   */
//  @DefaultValue("Lorem ipsum dolor sit amet")
  String authMethod;

  /**
   * login
   */
  String username;

  /**
   * pwd
   */
  String password;

}
