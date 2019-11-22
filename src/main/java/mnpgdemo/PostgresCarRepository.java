package mnpgdemo;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;

@Requires(env = Environment.GOOGLE_COMPUTE)
@Replaces(CarRepository.class)
@JdbcRepository(dialect = Dialect.POSTGRES)
public interface PostgresCarRepository extends CarRepository { }
