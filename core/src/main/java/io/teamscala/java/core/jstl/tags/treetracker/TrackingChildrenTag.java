package io.teamscala.java.core.jstl.tags.treetracker;

import io.teamscala.java.core.util.TreeHandler;
import io.teamscala.java.core.util.TreeTracker;

import javax.servlet.jsp.JspException;

/**
 * Object tracing children tag.
 *
 * @author 석기원
 */
public class TrackingChildrenTag extends LoopTagSupport {
    private static final long serialVersionUID = 2202092604802911246L;

    @Override
    protected void prepare(Object obj, String property, TreeHandler<Object> handler) throws JspException {
        try {
            new TreeTracker<>(null, property).trackingChildren(obj, handler);
        } catch (Exception e) {
            throw new JspException(e);
        }
    }
}
