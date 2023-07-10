package com.example.spring.jpa.onetoone.repository;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.jpa.onetoone.model.TutorialDetails;

public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails, Long> {
  @Transactional
  void deleteById(long id);

  @Transactional
  void deleteByTutorialId(long tutorialId);
}
