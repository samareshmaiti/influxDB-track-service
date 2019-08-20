package com.stackroute.repository;
import com.stackroute.domain.Track;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TrackRepository extends CrudRepository<Track,Integer> {


  // @AllowFiltering
  List<Track> getTrackByName(String name);



}
