package com.ciana.rule.engine.node.data;

import java.util.Map;

import com.ciana.rule.engine.parse.entity.RuleNode;

/**
 * 数据接口必须实现的接口
 * @author admin
 *
 */
public interface RuleDataInterface {

	public Map<String, Object> getData(RuleNode node, Map<String, Object> lastParams) throws Exception;
}
