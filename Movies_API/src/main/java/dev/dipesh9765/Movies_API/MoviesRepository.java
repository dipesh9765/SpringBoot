package dev.dipesh9765.Movies_API;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface MoviesRepository extends MongoRepository<Movie, ObjectId> {
        Optional<Movie> findMovieByImdbId(String imdbId);

}
