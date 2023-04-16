package com.yxcorp.gifshow.album.selected.interact.a$a;
import com.yxcorp.gifshow.album.selected.interact.a;
import r79.c;
import java.lang.Object;
import q79.d;
import androidx.fragment.app.Fragment;
import java.util.List;
import m79.g;
import j79.d;
import j79.c;

public final class a$a	// class@001ac6
{

    public static boolean a(a p0,c p1,int p2,boolean p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       if (p4 & 0x04) {
          p3 = true;
       }
       return p0.A(p1, p2, p3);
    }
    public static void b(a p0,Fragment p1,int p2,List p3,int p4,g p5,d p6,c p7,int p8,Object p9){
       g og = (p8 & 0x10)? null: p5;
       d uod = (p8 & 0x20)? null: p6;
       p0.f0(p1, p2, p3, p4, og, uod, null);
       return;
    }
}
