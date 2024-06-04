package S3_46.baitap.Repository;


import S3_46.baitap.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIsDeletedFalse();
}

