package com.lnzz.栈;

import java.util.HashMap;
import java.util.Stack;

/**
 * ClassName：_20_有效的括号
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/2 11:55
 * @Description:
 */
public class _20_有效的括号 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * <p>
     * 示例 1:
     * 输入: "()"
     * 输出: true
     * <p>
     * 示例 2:
     * 输入: "()[]{}"
     * 输出: true
     * <p>
     * 示例 3:
     * 输入: "(]"
     * 输出: false
     * <p>
     * 示例 4:
     * 输入: "([)]"
     * 输出: false
     * <p>
     * 示例 5:
     * 输入: "{[]}"
     * 输出: true
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    private static HashMap<Character, Character> map = new HashMap<Character, Character>();

    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                // 左括号
                stack.push(c);
            } else {
                // 右括号
                if (stack.isEmpty()) {
                    return false;
                }

                if (c != map.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (left == '(' && c != ')') {
                    return false;
                }
                if (left == '{' && c != '}') {
                    return false;
                }
                if (left == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
