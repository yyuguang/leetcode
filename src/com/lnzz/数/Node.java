package com.lnzz.数;

import java.util.List;

/**
 * ClassName：Node
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/9 17:08
 * @Description:
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
