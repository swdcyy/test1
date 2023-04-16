package bpb.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import bpb.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bpb.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@000424
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "IMPORT_MUSIC_ADDED_ID";
       try{
          p0.i(str, uod);
          p0.h(LocalMusicFragment.class, new e(this, p1));
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
