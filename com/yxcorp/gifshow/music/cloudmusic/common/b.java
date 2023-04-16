package com.yxcorp.gifshow.music.cloudmusic.common.b;
import ekd.q$b;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment;

public final class b implements q$b	// class@002001
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(Object p0){
       boolean b = (p0.mIsMagicRecommend == null && p0.mIsMockForGroupTitle == null)? true: false;
       return b;
    }
}
