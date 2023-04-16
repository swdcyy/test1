package com.facebook.cache.disk.DefaultDiskStorage$b;
import za.b;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.lang.Object;
import java.util.ArrayList;
import java.io.File;
import com.facebook.cache.disk.DefaultDiskStorage$d;
import com.facebook.cache.disk.DefaultDiskStorage$c;
import java.lang.String;
import com.facebook.cache.disk.DefaultDiskStorage$a;
import java.util.List;

public class DefaultDiskStorage$b implements b	// class@000427
{
    public final List a;
    public final DefaultDiskStorage b;

    public void DefaultDiskStorage$b(DefaultDiskStorage p0){
       this.b = p0;
       super();
       this.a = new ArrayList();
    }
    public void a(File p0){
    }
    public void b(File p0){
       DefaultDiskStorage$d uod = this.b.n(p0);
       if (uod != null && uod.a == ".cnt") {
          this.a.add(new DefaultDiskStorage$c(uod.b, p0, null));
       }
       return;
    }
    public void c(File p0){
    }
}
