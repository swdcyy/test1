package com.yxcorp.gifshow.v3.editor.prettify.filter.e;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;

public final class e implements Runnable	// class@00116d
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       Filters.init(i.S8());
    }
}
