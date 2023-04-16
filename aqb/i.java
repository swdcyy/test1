package aqb.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import aqb.a;
import aqb.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aqb.c;
import aqb.d;
import aqb.e;
import aqb.f;
import aqb.g;
import aqb.h;
import java.lang.Class;
import mm8.a;

public final class i implements b	// class@0002c4
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PHOTO_DETAIL_ACTIVITY_FINISH_EVENT", new b(this, p1));
       p0.i("MUSIC_RADIO_CHANGE_PLAYER_STATE_OBSERVABLE", new c(this, p1));
       p0.i("MUSIC_RADIO_CHANGE_PLAYER_STATE_OBSERVER", new d(this, p1));
       p0.i("MUSIC_RADIO_NOTIFICATION_HELPER", new e(this, p1));
       p0.i("MUSIC_RADIO_PLAY_STATE_CHANGE_OBSERVABLE ", new f(this, p1));
       g og = new g(this, p1);
       String str = "MUSIC_RADIO_PLAY_STATE_CHANGE_OBSERVER";
       try{
          p0.i(str, og);
          p0.h(a.class, new h(this, p1));
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
