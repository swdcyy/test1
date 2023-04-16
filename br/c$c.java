package br.c$c;
import v2.q0;
import br.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$c extends q0	// class@000332
{
    public final c d;

    public void c$c(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM LogRecord WHERE clientTimestamp <= ?";
    }
}
