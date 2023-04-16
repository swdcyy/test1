package ced.d1;
import com.yxcorp.plugin.search.result.hashtag.presenters.e$d;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.String;
import brd.t;
import wkd.b;
import z6d.l;
import com.kuaishou.android.model.music.MusicType;

public final class d1 implements e$d	// class@000549
{
    public final Music a;

    public void d1(Music p0){
       this.a = p0;
    }
    public final t a(String p0){
       d1 ta = this.a;
       return b.a(0x6624be17).shareMusicTag(ta.mId, ta.mType.mValue, p0);
    }
}
