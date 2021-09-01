package ru.vlapin.experiments.springbootdemo100.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.springbootdemo100.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
