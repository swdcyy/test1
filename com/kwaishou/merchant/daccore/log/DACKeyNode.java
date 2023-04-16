package com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DACKeyNode extends Enum	// class@00131c
{
    public static final DACKeyNode[] $VALUES;
    public static final DACKeyNode COMPONENT_BUSINESS_LOGIC;
    public static final DACKeyNode COMPONENT_CREATE_RENDER;
    public static final DACKeyNode COMPONENT_DATA_CHECK;
    public static final DACKeyNode COMPONENT_MOUNT_UPDATE;
    public static final DACKeyNode COMPONENT_SHOULD_SHOW;
    public static final DACKeyNode DAC_ENV_INIT;
    public static final DACKeyNode DAC_FRAMEWORK;
    public static final DACKeyNode DAC_RECEIVER_REQUEST_DATA;

    static {
       DACKeyNode uDACKeyNode;
       DACKeyNode[] uDACKeyNodeA = new DACKeyNode[]{uDACKeyNode,uDACKeyNode,uDACKeyNode,uDACKeyNode,uDACKeyNode,uDACKeyNode,uDACKeyNode,uDACKeyNode};
       uDACKeyNode = new DACKeyNode("DAC_FRAMEWORK", 0);
       DACKeyNode.DAC_FRAMEWORK = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("DAC_ENV_INIT", 1);
       DACKeyNode.DAC_ENV_INIT = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("DAC_RECEIVER_REQUEST_DATA", 2);
       DACKeyNode.DAC_RECEIVER_REQUEST_DATA = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("COMPONENT_DATA_CHECK", 3);
       DACKeyNode.COMPONENT_DATA_CHECK = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("COMPONENT_SHOULD_SHOW", 4);
       DACKeyNode.COMPONENT_SHOULD_SHOW = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("COMPONENT_CREATE_RENDER", 5);
       DACKeyNode.COMPONENT_CREATE_RENDER = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("COMPONENT_MOUNT_UPDATE", 6);
       DACKeyNode.COMPONENT_MOUNT_UPDATE = uDACKeyNode;
       uDACKeyNode = new DACKeyNode("COMPONENT_BUSINESS_LOGIC", 7);
       DACKeyNode.COMPONENT_BUSINESS_LOGIC = uDACKeyNode;
       DACKeyNode.$VALUES = uDACKeyNodeA;
    }
    public void DACKeyNode(String p0,int p1){
       super(p0, p1);
    }
    public static DACKeyNode valueOf(String p0){
       return Enum.valueOf(DACKeyNode.class, p0);
    }
    public static DACKeyNode[] values(){
       return DACKeyNode.$VALUES.clone();
    }
}
