public class Movie {
 private String work;
 private Enum actor;
 private Avatap avatap;

 public String getWork() {
  return work;
 }

 public Enum getActor() {
  return actor;
 }

 public Movie(String work, Enum actor, Avatap avatap) {
  this.work = work;
  this.actor = actor;
  this.avatap = avatap;
 }

 public Avatap getAvatap() {
  return avatap;
 }
}
