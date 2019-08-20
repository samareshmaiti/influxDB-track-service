package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.influxdb.annotation.Measurement;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Measurement(name = "track")
public class Track {
    //Declare of the variables
  //  @Id
//    @PrimaryKey
  // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String comment;
    private Instant time;

}
