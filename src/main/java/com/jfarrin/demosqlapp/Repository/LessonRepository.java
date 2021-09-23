package com.jfarrin.demosqlapp.Repository;

import com.jfarrin.demosqlapp.Model.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
}
