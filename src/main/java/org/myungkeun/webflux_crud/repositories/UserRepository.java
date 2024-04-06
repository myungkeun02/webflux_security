package org.myungkeun.webflux_crud.repositories;

import org.myungkeun.webflux_crud.entities.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
    Mono<User> findByPhoneAndPassword(String phone, String password);

    Mono<User> findByPhone(String phone);
}
