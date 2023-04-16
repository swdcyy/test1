package iy0.b;
import lf3.g;
import iy0.g;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveQuickCommentMessages$SCLiveQuickCommentChanged;
import ekd.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import iy0.d;
import ekd.q$b;
import ekd.q;
import lf3.f;

public final class b implements g	// class@0029b4
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       tb.P8();
       if (!j.h(p0.comment)) {
          ArrayList uArrayList = new ArrayList(Arrays.asList(p0.comment));
          q.c(uArrayList, d.a);
          tb.S8(uArrayList);
          tb.R8();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
