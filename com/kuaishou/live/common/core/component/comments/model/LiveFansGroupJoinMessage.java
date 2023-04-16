package com.kuaishou.live.common.core.component.comments.model.LiveFansGroupJoinMessage;
import com.kuaishou.live.basic.model.QLiveMessage;

public class LiveFansGroupJoinMessage extends QLiveMessage	// class@0010b9
{
    public int mJoinSource;
    public boolean mShouldShowJoinButton;
    public static final long serialVersionUID = 0xc4844b021b989c40;

    public void LiveFansGroupJoinMessage(){
       super();
    }
    public boolean shouldShowJoinButton(){
       boolean b = (this.mShouldShowJoinButton != null && this.mIsFoldMessage == null)? true: false;
       return b;
    }
}
