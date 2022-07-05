package SpringStuff;

import org.eclipse.jetty.websocket.common.SessionFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistDataAccessObject implements JpaRepository<Artist, Long> {
    private SessionFactory searchAllBy;


    @Override
    public List<Artist> findAll() {
        return null;
    }

    @Override
    public List<Artist> findAll(Sort sort) {
        return null;
    }

         @Override
    public Page<Artist> findAll(Pageable pageable) {
        return null;
    }

      @Override
    public List<Artist> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Artist artist) {

    }

    @Override
    public void deleteAll(Iterable<? extends Artist> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Artist> S save(S s) {
        return null;
    }

    @Override
    public <S extends Artist> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Artist> findById(Long aLong) {
        return Optional.empty();
    }

        @Override
    public boolean existsById(Long aLong) {
        return false;
    }

     @Override
    public void flush() {

    }

    @Override
    public <S extends Artist> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Artist> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Artist getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Artist> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Artist> List<S> findAll(Example<S> example) {
        return null;
    }
    @Override
    public <S extends Artist> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Artist> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Artist> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Artist> boolean exists(Example<S> example) {
        return false;
    }
}