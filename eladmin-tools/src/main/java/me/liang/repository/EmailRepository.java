package me.liang.repository;

import me.liang.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
