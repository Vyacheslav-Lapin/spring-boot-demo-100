package ru.vlapin.experiments.springbootdemo100.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ru.vlapin.experiments.springbootdemo100.common.Loggable;
import ru.vlapin.experiments.springbootdemo100.dao.CatRepository;
import ru.vlapin.experiments.springbootdemo100.model.Cat;

import static ru.vlapin.experiments.springbootdemo100.common.Loggable.LogLevel.INFO;

@Component
@Loggable(INFO)
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
