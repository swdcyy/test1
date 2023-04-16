package c46.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.feature.post.api.music.data.HistoryMusic;
import com.kuaishou.android.model.music.Music;
import c46.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c46.b;
import mm8.a;

public final class c implements b	// class@000647
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       Music music = Music.class;
       a uoa = new a(this, p1);
       try{
          p0.h(music, uoa);
          p0.h(HistoryMusic.class, new b(this, p1));
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
