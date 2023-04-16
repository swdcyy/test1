package androidx.lifecycle.Lifecycle$Event;
import java.lang.Enum;
import java.lang.String;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle$1;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class Lifecycle$Event extends Enum	// class@0007c8
{
    public static final Lifecycle$Event[] $VALUES;
    public static final Lifecycle$Event ON_ANY;
    public static final Lifecycle$Event ON_CREATE;
    public static final Lifecycle$Event ON_DESTROY;
    public static final Lifecycle$Event ON_PAUSE;
    public static final Lifecycle$Event ON_RESUME;
    public static final Lifecycle$Event ON_START;
    public static final Lifecycle$Event ON_STOP;

    static {
       Lifecycle$Event uEvent = new Lifecycle$Event("ON_CREATE", 0);
       Lifecycle$Event.ON_CREATE = uEvent;
       Lifecycle$Event uEvent1 = new Lifecycle$Event("ON_START", 1);
       Lifecycle$Event.ON_START = uEvent1;
       Lifecycle$Event uEvent2 = new Lifecycle$Event("ON_RESUME", 2);
       Lifecycle$Event.ON_RESUME = uEvent2;
       Lifecycle$Event uEvent3 = new Lifecycle$Event("ON_PAUSE", 3);
       Lifecycle$Event.ON_PAUSE = uEvent3;
       Lifecycle$Event uEvent4 = new Lifecycle$Event("ON_STOP", 4);
       Lifecycle$Event.ON_STOP = uEvent4;
       Lifecycle$Event uEvent5 = new Lifecycle$Event("ON_DESTROY", 5);
       Lifecycle$Event.ON_DESTROY = uEvent5;
       Lifecycle$Event uEvent6 = new Lifecycle$Event("ON_ANY", 6);
       Lifecycle$Event.ON_ANY = uEvent6;
       Lifecycle$Event[] uEventArray = new Lifecycle$Event[]{uEvent,uEvent1,uEvent2,uEvent3,uEvent4,uEvent5,uEvent6};
       Lifecycle$Event.$VALUES = uEventArray;
    }
    public void Lifecycle$Event(String p0,int p1){
       super(p0, p1);
    }
    public static Lifecycle$Event downFrom(Lifecycle$State p0){
       int i = Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i == 1) {
          return Lifecycle$Event.ON_DESTROY;
       }
       if (i == 2) {
          return Lifecycle$Event.ON_STOP;
       }
       if (i != 3) {
          return null;
       }
       return Lifecycle$Event.ON_PAUSE;
    }
    public static Lifecycle$Event downTo(Lifecycle$State p0){
       int i = Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i == 1) {
          return Lifecycle$Event.ON_STOP;
       }
       if (i == 2) {
          return Lifecycle$Event.ON_PAUSE;
       }
       if (i != 4) {
          return null;
       }
       return Lifecycle$Event.ON_DESTROY;
    }
    public static Lifecycle$Event upFrom(Lifecycle$State p0){
       int i = Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i == 1) {
          return Lifecycle$Event.ON_START;
       }
       if (i == 2) {
          return Lifecycle$Event.ON_RESUME;
       }
       if (i != 5) {
          return null;
       }
       return Lifecycle$Event.ON_CREATE;
    }
    public static Lifecycle$Event upTo(Lifecycle$State p0){
       int i = Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[p0.ordinal()];
       if (i == 1) {
          return Lifecycle$Event.ON_CREATE;
       }
       if (i == 2) {
          return Lifecycle$Event.ON_START;
       }
       if (i != 3) {
          return null;
       }
       return Lifecycle$Event.ON_RESUME;
    }
    public static Lifecycle$Event valueOf(String p0){
       return Enum.valueOf(Lifecycle$Event.class, p0);
    }
    public static Lifecycle$Event[] values(){
       return Lifecycle$Event.$VALUES.clone();
    }
    public Lifecycle$State getTargetState(){
       switch (Lifecycle$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[this.ordinal()]){
           case 1:
           case 2:
             return Lifecycle$State.CREATED;
           case 3:
           case 4:
             return Lifecycle$State.STARTED;
           case 5:
             return Lifecycle$State.RESUMED;
           case 6:
             return Lifecycle$State.DESTROYED;
           default:
             throw new IllegalArgumentException(this+" has no target state");
       }
    }
}
