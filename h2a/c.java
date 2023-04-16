package h2a.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import h2a.m$a$a;
import h2a.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h2a.b;
import java.lang.Class;
import mm8.a;

public final class c implements b	// class@002543
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       a uoa = new a(this, p1);
       String str = "REASON_SELECT_STATUS_CHANGE_OBSERVER";
       try{
          p0.i(str, uoa);
          p0.h(m$a$a.class, new b(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
