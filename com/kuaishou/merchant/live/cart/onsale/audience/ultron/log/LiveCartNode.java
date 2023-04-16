package com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import java.lang.Enum;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCartNode extends Enum	// class@001999
{
    public final boolean isEnv;
    public final boolean isImportant;
    public final KeyNode node;
    public final LiveCartNode parent;
    public static final LiveCartNode[] $VALUES;
    public static final LiveCartNode BRIDGE;
    public static final LiveCartNode LOGIC;
    public static final LiveCartNode POP_COMMODITY;
    public static final LiveCartNode RENDER;
    public static final LiveCartNode RENDER_ADD_VIEW;
    public static final LiveCartNode RENDER_DATA;
    public static final LiveCartNode RENDER_REFRESH_WHEN_CACHE;
    public static final LiveCartNode RENDER_SHOW;
    public static final LiveCartNode RENDER_START;
    public static final LiveCartNode SIGNAL_COMMODITY_CHANGE;
    public static final LiveCartNode SIGNAL_UPDATE;

    static {
       LiveCartNode[] liveCartNode = new LiveCartNode[11];
       LiveCartNode liveCartNode1 = new LiveCartNode("RENDER", 0, new KeyNode("С�Ƴ�ҳ����Ⱦ", "LiveCart"), null, true, false, 8, null);
       LiveCartNode.RENDER = v10;
       liveCartNode[0] = v10;
       LiveCartNode liveCartNode2 = v10;
       liveCartNode1 = new LiveCartNode("RENDER_START", 1, new KeyNode("��ʼrenderPage", "LiveCart"), liveCartNode2, false, true);
       LiveCartNode.RENDER_START = v8;
       liveCartNode[1] = v8;
       liveCartNode1 = new LiveCartNode("RENDER_DATA", 2, new KeyNode("���ݻ�ȡ���", "LiveCart"), liveCartNode2, false, true);
       LiveCartNode.RENDER_DATA = v8;
       liveCartNode[2] = v8;
       liveCartNode1 = new LiveCartNode("RENDER_ADD_VIEW", 3, new KeyNode("���������rootView", "LiveCart"), liveCartNode2, false, false, 12, null);
       LiveCartNode.RENDER_ADD_VIEW = v12;
       liveCartNode[3] = v12;
       liveCartNode1 = new LiveCartNode("RENDER_SHOW", 4, new KeyNode("С�Ƴ��б�չʾ���", "LiveCart"), liveCartNode2, false, false, 12, null);
       LiveCartNode.RENDER_SHOW = v12;
       liveCartNode[4] = v12;
       liveCartNode1 = new LiveCartNode("RENDER_REFRESH_WHEN_CACHE", 5, new KeyNode("ʹ�û����ˢ��", "LiveCart"), liveCartNode2, false, false, 12, null);
       LiveCartNode.RENDER_REFRESH_WHEN_CACHE = v12;
       liveCartNode[5] = v12;
       LiveCartNode liveCartNode3 = new LiveCartNode("LOGIC", 6, new KeyNode("С�Ƴ�ҳ�潻��", "LiveCart"), null, true, false, 8, null);
       LiveCartNode.LOGIC = liveCartNode1;
       liveCartNode[6] = liveCartNode1;
       LiveCartNode liveCartNode4 = liveCartNode1;
       liveCartNode3 = new LiveCartNode("BRIDGE", 7, new KeyNode("Bridge����", "LiveCart"), liveCartNode4, true, false, 8, null);
       LiveCartNode.BRIDGE = v12;
       liveCartNode[7] = v12;
       liveCartNode3 = new LiveCartNode("SIGNAL_COMMODITY_CHANGE", 8, new KeyNode("��Ʒ����������", "LiveCart"), liveCartNode4, true, false, 8, null);
       LiveCartNode.SIGNAL_COMMODITY_CHANGE = v12;
       liveCartNode[8] = v12;
       liveCartNode3 = new LiveCartNode("SIGNAL_UPDATE", 9, new KeyNode("ʵʱ��������", "LiveCart"), liveCartNode4, true, false, 8, null);
       LiveCartNode.SIGNAL_UPDATE = v12;
       liveCartNode[9] = v12;
       liveCartNode3 = new LiveCartNode("POP_COMMODITY", 10, new KeyNode("�������ݸ���", "LiveCart"), liveCartNode4, true, false, 8, null);
       LiveCartNode.POP_COMMODITY = v12;
       liveCartNode[10] = v12;
       LiveCartNode.$VALUES = liveCartNode;
    }
    public void LiveCartNode(String p0,int p1,KeyNode p2,LiveCartNode p3,boolean p4,boolean p5){
       super(p0, p1);
       this.node = p2;
       this.parent = p3;
       this.isEnv = p4;
       this.isImportant = p5;
    }
    public void LiveCartNode(String p0,int p1,KeyNode p2,LiveCartNode p3,boolean p4,boolean p5,int p6,u p7){
       if (p6 & 0x02) {
          p3 = null;
       }
       LiveCartNode liveCartNode = p3;
       boolean b = (p6 & 0x04)? false: p4;
       boolean b1 = (p6 & 0x08)? false: p5;
       super(p0, p1, p2, liveCartNode, b, b1);
       return;
    }
    public static LiveCartNode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCartNode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCartNode.class, p0);
    }
    public static LiveCartNode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCartNode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCartNode.$VALUES.clone();
    }
    public final KeyNode getNode(){
       return this.node;
    }
    public final LiveCartNode getParent(){
       return this.parent;
    }
    public final boolean isEnv(){
       return this.isEnv;
    }
    public final boolean isImportant(){
       return this.isImportant;
    }
}
