package intersorg.task.repository;
import intersorg.task.model.LoansDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepo extends JpaRepository<LoansDataEntity, Long> {

    List<LoansDataEntity> findAll();

   List<LoansDataEntity> findByGender(int gender);

    @Query(value = "SELECT u FROM LoansDataEntity u WHERE u.city = :city")
    List<LoansDataEntity> find(@Param("city") String city);

    @Query(value = "SELECT u FROM LoansDataEntity u WHERE u.gender = :gender and u.city = :city and u.status = :status")
    List<LoansDataEntity> findToParam(
            @Param("gender") int gender,
            @Param("city")String city,
            @Param("status") String status);
}
