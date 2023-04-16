package dfc.c;
import erd.g;
import dfc.g;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.reminder.news.data.NewsEntranceResponse;
import brd.y;

public final class c implements g	// class@0021a0
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.r.onNext(new NewsEntranceResponse());
    }
}
