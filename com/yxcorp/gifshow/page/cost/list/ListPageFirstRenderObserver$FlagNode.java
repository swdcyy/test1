package com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$FlagNode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ListPageFirstRenderObserver$FlagNode extends Enum	// class@000e20
{
    public final int mNextValue;
    public final ListPageFirstRenderObserver$FlagNode mPreNode;
    public final int mValue;
    public static final ListPageFirstRenderObserver$FlagNode[] $VALUES;
    public static final ListPageFirstRenderObserver$FlagNode DATA_INITED;
    public static final ListPageFirstRenderObserver$FlagNode LAUNCH_FINISH_PRE_RENDER;
    public static final ListPageFirstRenderObserver$FlagNode LAUNCH_FINISH_RENDERED;
    public static final ListPageFirstRenderObserver$FlagNode NONE;

    static {
       ListPageFirstRenderObserver$FlagNode uFlagNode = new ListPageFirstRenderObserver$FlagNode("NONE", 0, null, 0, 1);
       ListPageFirstRenderObserver$FlagNode.NONE = v6;
       uFlagNode = new ListPageFirstRenderObserver$FlagNode("DATA_INITED", 1, v6, 1, 2);
       ListPageFirstRenderObserver$FlagNode.DATA_INITED = v13;
       ListPageFirstRenderObserver$FlagNode uFlagNode1 = new ListPageFirstRenderObserver$FlagNode("LAUNCH_FINISH_PRE_RENDER", 2, v13, 2, 3);
       ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_PRE_RENDER = uFlagNode;
       uFlagNode1 = new ListPageFirstRenderObserver$FlagNode("LAUNCH_FINISH_RENDERED", 3, uFlagNode, 3, -1);
       ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_RENDERED = v1;
       ListPageFirstRenderObserver$FlagNode[] uFlagNodeArr = new ListPageFirstRenderObserver$FlagNode[]{v6,v13,uFlagNode,v1};
       ListPageFirstRenderObserver$FlagNode.$VALUES = uFlagNodeArr;
    }
    public void ListPageFirstRenderObserver$FlagNode(String p0,int p1,ListPageFirstRenderObserver$FlagNode p2,int p3,int p4){
       super(p0, p1);
       this.mPreNode = p2;
       this.mValue = p3;
       this.mNextValue = p4;
    }
    public static ListPageFirstRenderObserver$FlagNode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ListPageFirstRenderObserver$FlagNode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ListPageFirstRenderObserver$FlagNode.class, p0);
    }
    public static ListPageFirstRenderObserver$FlagNode[] values(){
       Object obj = PatchProxy.apply(null, null, ListPageFirstRenderObserver$FlagNode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ListPageFirstRenderObserver$FlagNode.$VALUES.clone();
    }
}
