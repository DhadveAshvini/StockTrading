package org.com.trad.repository;

import org.com.trad.model.TradeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeDetailsRepository extends JpaRepository<TradeDetails, Long> {
}
