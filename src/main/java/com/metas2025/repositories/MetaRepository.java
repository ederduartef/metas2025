package com.metas2025.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.metas2025.models.tabelaMetas;

public interface MetaRepository extends JpaRepository<tabelaMetas, Long> {


}
