package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import java.lang.Enum;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$e;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$h;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$f;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$g;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthTestViewHolderEnum extends Enum	// class@00157e
{
    public final d clazz;
    public static final GrowthTestViewHolderEnum[] $VALUES;
    public static final GrowthTestViewHolderEnum Action;
    public static final GrowthTestViewHolderEnum Content;
    public static final GrowthTestViewHolderEnum Edit;
    public static final GrowthTestViewHolderEnum EditList;
    public static final GrowthTestViewHolderEnum List;
    public static final GrowthTestViewHolderEnum Select;
    public static final GrowthTestViewHolderEnum Space;
    public static final GrowthTestViewHolderEnum SubTitle;
    public static final GrowthTestViewHolderEnum Switch;
    public static final GrowthTestViewHolderEnum Title;

    static {
       GrowthTestViewHolderEnum[] growthTestVi = new GrowthTestViewHolderEnum[10];
       GrowthTestViewHolderEnum growthTestVi1 = new GrowthTestViewHolderEnum("Space", 0, m0.d(GrowthTestViewHolder$e.class));
       GrowthTestViewHolderEnum.Space = growthTestVi1;
       growthTestVi[0] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Title", 1, m0.d(GrowthTestViewHolder$h.class));
       GrowthTestViewHolderEnum.Title = growthTestVi1;
       growthTestVi[1] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("SubTitle", 2, m0.d(GrowthTestViewHolder$f.class));
       GrowthTestViewHolderEnum.SubTitle = growthTestVi1;
       growthTestVi[2] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Switch", 3, m0.d(GrowthTestViewHolder$g.class));
       GrowthTestViewHolderEnum.Switch = growthTestVi1;
       growthTestVi[3] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("List", 4, m0.d(GrowthTestViewHolder$List.class));
       GrowthTestViewHolderEnum.List = growthTestVi1;
       growthTestVi[4] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Action", 5, m0.d(GrowthTestViewHolder$a.class));
       GrowthTestViewHolderEnum.Action = growthTestVi1;
       growthTestVi[5] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Edit", 6, m0.d(GrowthTestViewHolder$c.class));
       GrowthTestViewHolderEnum.Edit = growthTestVi1;
       growthTestVi[6] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("EditList", 7, m0.d(GrowthTestViewHolder$EditList.class));
       GrowthTestViewHolderEnum.EditList = growthTestVi1;
       growthTestVi[7] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Select", 8, m0.d(GrowthTestViewHolder$d.class));
       GrowthTestViewHolderEnum.Select = growthTestVi1;
       growthTestVi[8] = growthTestVi1;
       growthTestVi1 = new GrowthTestViewHolderEnum("Content", 9, m0.d(GrowthTestViewHolder$b.class));
       GrowthTestViewHolderEnum.Content = growthTestVi1;
       growthTestVi[9] = growthTestVi1;
       GrowthTestViewHolderEnum.$VALUES = growthTestVi;
    }
    public void GrowthTestViewHolderEnum(String p0,int p1,d p2){
       super(p0, p1);
       this.clazz = p2;
    }
    public static GrowthTestViewHolderEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthTestViewHolderEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthTestViewHolderEnum.class, p0);
    }
    public static GrowthTestViewHolderEnum[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthTestViewHolderEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthTestViewHolderEnum.$VALUES.clone();
    }
    public final d getClazz(){
       return this.clazz;
    }
}
