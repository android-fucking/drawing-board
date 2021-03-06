package cn.edu.shu.android.group6.drawingboard.app.core.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import cn.edu.shu.android.group6.drawingboard.app.R;
import cn.edu.shu.android.group6.drawingboard.app.core.tool.Tool;
import cn.edu.shu.android.group6.drawingboard.app.core.tool.ToolManager;
import cn.edu.shu.android.group6.drawingboard.app.util.ListenerUtil;

/**
 * Created by yy on 3/1/14.
 */
public class Toolbox extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.toolbox, container, false);
        root.setOnTouchListener(ListenerUtil.floatListener);
        LinearLayout toolboxContainer = (LinearLayout) root.findViewById(R.id.toolbox_container);
        List<Tool> tools = ToolManager.getTools();
        for (final Tool t : tools) {
//            Button btn = new Button(getActivity());
//            btn.setText(t.getName());
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    t.startUsing();
//                    if (!t.isOneoff()) {
//                        ((Button) v).setTextColor(Color.RED);
//                    }
//                }
//            });
//            t.setView(t.getView());
            toolboxContainer.addView(t.getView());
        }
        return root;
    }
}
