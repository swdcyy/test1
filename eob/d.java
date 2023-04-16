package eob.d;
import erd.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Integer;
import eob.t;
import tkd.b;
import tkd.d;
import qw5.b;
import brd.a;
import java.lang.Boolean;
import brd.t;
import brd.w;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public final class d implements o	// class@00278c
{
    public final GifshowActivity b;
    public final QPhoto c;
    public final int d;

    public void d(GifshowActivity p0,QPhoto p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       p0 = (t.b(p0.intValue()))? d.a(0x62409668).JG(tb, tc, td).d(t.just(Boolean.TRUE)): t.error(new Exception("Plugin install failed\xff\x02\xff\x02\xff\x02\xff\x02!\x00"));
       return p0;
    }
}
