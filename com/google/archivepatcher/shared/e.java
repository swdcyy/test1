package com.google.archivepatcher.shared.e;
import java.util.List;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import com.google.archivepatcher.shared.PartiallyUncompressingPipe;
import com.google.archivepatcher.shared.g;
import java.util.Iterator;
import java.lang.Object;
import nk.b;
import com.google.archivepatcher.shared.PartiallyUncompressingPipe$Mode;
import java.io.InputStream;

public class e	// class@001706
{

    public static List a(List p0,File p1,OutputStream p2,boolean p3,int p4){
       Iterator iterator = null;
       ArrayList uArrayList = (p3)? new ArrayList(p0.size()): iterator;
       PartiallyUncompressingPipe partiallyUnc = new PartiallyUncompressingPipe(p2, p4);
       g og = new g(p1);
       iterator = p0.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          b uob = iterator.next();
          long l1 = uob.c() - l;
          if (l1 > 0) {
             og.a(l, l1);
             partiallyUnc.b(og, PartiallyUncompressingPipe$Mode.COPY);
          }
          og.a(uob.c(), uob.a());
          long l2 = partiallyUnc.a();
          partiallyUnc.b(og, PartiallyUncompressingPipe$Mode.UNCOMPRESS_NOWRAP);
          l = uob.c() + uob.a();
          if (p3) {
             long l3 = partiallyUnc.a() - l2;
             b uob1 = new b(l2, l3, uob.b());
             uArrayList.add(l1);
          }
       }
       long l4 = og.f - l;
       if (l4 > 0) {
          og.a(l, l4);
          partiallyUnc.b(og, PartiallyUncompressingPipe$Mode.COPY);
       }
       try{
          og.close();
          try{
             partiallyUnc.close();
             return e0;
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
