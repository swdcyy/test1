package com.yxcorp.retrofit.region.config.RegionInfo;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable$a;
import java.util.Iterator;
import qjd.a;
import java.lang.String;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import pjd.a;
import com.yxcorp.retrofit.model.Region;

public class RegionInfo	// class@00097d
{
    public List mAPIGroupHostList;
    public List mAPIMappings;
    public Region mRegion;

    public void RegionInfo(){
       super();
    }
    public List a(){
       RegionInfo tmAPIGroupHo = this.mAPIGroupHostList;
       if (tmAPIGroupHo == null) {
          tmAPIGroupHo = new ArrayList();
       }
       return tmAPIGroupHo;
    }
    public List b(){
       RegionInfo tmAPIMapping = this.mAPIMappings;
       if (tmAPIMapping == null) {
          tmAPIMapping = new ArrayList();
       }
       return tmAPIMapping;
    }
    public Optional c(){
       return Optional.fromNullable(this.mRegion);
    }
    public final ImmutableTable d(List p0){
       ImmutableTable$a uoa = ImmutableTable.builder();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa1 = iterator.next();
          String str = uoa1.e();
          String str1 = uoa1.a();
          uoa.b(str, str1, new a(ImmutableSet.copyOf(uoa1.c()), ImmutableSet.copyOf(uoa1.d())));
       }
       return uoa.a();
    }
    public boolean e(RegionInfo p0){
       this.mRegion = p0.c().or(new Region());
       this.mAPIMappings = p0.b();
       int i = this.d(this.a()).equals(this.d(p0.a())) ^ 0x01;
       if (i) {
          this.mAPIGroupHostList = p0.a();
       }
       return i;
    }
}
