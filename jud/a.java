package jud.a;
import java.util.Comparator;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.io.File;
import java.util.Arrays;
import java.lang.String;
import java.lang.Class;

public abstract class a implements Comparator	// class@001749
{

    public void a(){
       super();
    }
    public List sort(List p0){
       if (p0 != null) {
          Collections.sort(p0, this);
       }
       return p0;
    }
    public File[] sort(File[] p0){
       if (p0 != null) {
          Arrays.sort(p0, this);
       }
       return p0;
    }
    public String toString(){
       return this.getClass().getSimpleName();
    }
}
