package uk.ac.hw.macs.search.example;
import uk.ac.hw.macs.search.GridState;
import uk.ac.hw.macs.search.Node;
import uk.ac.hw.macs.search.SearchOrder;
import uk.ac.hw.macs.search.SearchProblem;


public class MainGridState {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GridState grid1 = new GridState(0,0,3,4);
		GridState grid2 = new GridState(0,0,4,4);
		

		System.out.print("A*Search from start to goal on:" + '\n');
	    System.out.print("Grid1" + '\n');	
			
		Node root1 = new Node(new GridState(0,0,3,4)); //S
		Node goal1 = new Node(new GridState(3,4,3,4)); //G
		
		Node x = new Node(new GridState(0,1,3,4));
		Node a = new Node(new GridState(1,0,3,4));
        Node y  = new Node(new GridState(1,1,3,4));
        Node b  = new Node(new GridState(2,0,3,4));
        Node d  = new Node(new GridState(2,1,3,4));
        Node c  = new Node(new GridState(3,0,3,4));        
        Node e  = new Node(new GridState(3,1,3,4));
        Node z  = new Node(new GridState(2,2,3,4));
        Node f  = new Node(new GridState(3,2,3,4));
        Node g  = new Node(new GridState(0,2,3,4));
        Node h  = new Node(new GridState(0,3,3,4));
        Node i  = new Node(new GridState(0,4,3,4));
        Node k  = new Node(new GridState(0,5,3,4));
        Node j  = new Node(new GridState(1,3,3,4));
        Node v  = new Node(new GridState(1,4,3,4));        
        Node l  = new Node(new GridState(1,5,3,4));
        Node m  = new Node(new GridState(2,5,3,4));
        Node n  = new Node(new GridState(3,5,3,4));
        Node w  = new Node(new GridState(2,4,3,4));
        

    root1.addChild(a, 1);
    root1.addChild(x, 3);

    a.addChild(root1, 1);
    a.addChild(b, 1);
    a.addChild(y, 3);
	b.addChild(a, 1);
	b.addChild(d, 1);
	b.addChild(c, 1);
	c.addChild(b, 1);
	c.addChild(e, 1);
	d.addChild(e, 1);
	d.addChild(y, 3);
	d.addChild(z, 3);	
	e.addChild(c, 1);
	e.addChild(d, 1);
	e.addChild(f, 1);
	f.addChild(e, 1);
	f.addChild(z, 3);
	x.addChild(root1, 1);
	x.addChild(g, 1);
	x.addChild(y, 3);
	y.addChild(a, 1);
	y.addChild(d, 1);
	y.addChild(x, 3);
	z.addChild(d, 1);
	z.addChild(f, 1);
	g.addChild(x, 3);
	g.addChild(h, 1);
	h.addChild(g, 1);
	h.addChild(i, 1);
	h.addChild(j, 1);
	i.addChild(h, 1);
	i.addChild(k, 1);
	i.addChild(v, 3);	
	j.addChild(h, 1);
	j.addChild(v, 3);
	k.addChild(i, 1);
	k.addChild(l, 1);
	l.addChild(k, 1);
	l.addChild(m, 1);
	l.addChild(v, 3);
	m.addChild(l, 1);
	m.addChild(n, 1);
	m.addChild(w, 3);
	n.addChild(m, 1);
	n.addChild(goal1, 1);
	v.addChild(j, 1);
	v.addChild(i, 1);
	v.addChild(l, 1);
	w.addChild(m, 1);
	w.addChild(goal1, 1);
	w.addChild(v, 3);	
	goal1.addChild(n, 1);
	goal1.addChild(w, 3);

		
	SearchOrder order1 = new AStarSearchOrder();
	SearchProblem problem1 = new SearchProblem(order1);
	problem1.doSearch(root1);

	System.out.print("----------------------------" + '\n');
	System.out.print("A*Search from start to goal on:" + '\n');
		System.out.print("Grid2" + '\n');
		
		Node root2 = new Node(new GridState(0,0,4,4)); 
		Node goal2 = new Node(new GridState(4,4,4,4)); 
		
		
		Node a2 = new Node(new GridState(1,0,4,4));		
		Node b2 = new Node(new GridState(2,0,4,4));		
		Node e2 = new Node(new GridState(4,0,4,4));		
		Node t = new Node(new GridState(0,1,4,4));		
		Node r = new Node(new GridState(0,2,4,4));		
		Node q = new Node(new GridState(0,3,4,4));		
		Node p = new Node(new GridState(0,4,4,4));		
		Node c2 = new Node(new GridState(2,1,4,4));		
		Node d2 = new Node(new GridState(3,1,4,4));		
		Node f2 = new Node(new GridState(4,1,4,4));		
		Node i2 = new Node(new GridState(3,2,4,4));		
		Node h2 = new Node(new GridState(4,2,4,4));		
		Node m2 = new Node(new GridState(2,3,4,4));		
		Node j2 = new Node(new GridState(3,3,4,4));		
		Node k2 = new Node(new GridState(4,3,4,4));		
		Node o = new Node(new GridState(1,4,4,4));		
		Node n2 = new Node(new GridState(2,4,4,4));		
		Node l2 = new Node(new GridState(3,4,4,4));
		
		root2.addChild(t, 1);
		root2.addChild(a2, 3);		
		a2.addChild(root2, 1);
		a2.addChild(b2, 1);	
		b2.addChild(c2, 1);
		b2.addChild(a2, 3);		
		c2.addChild(b2, 1);
		c2.addChild(d2, 1);		
		d2.addChild(c2, 1);
		d2.addChild(f2, 1);
		d2.addChild(i2, 3);		
		e2.addChild(f2, 1);		
		f2.addChild(d2, 1);
		f2.addChild(e2, 1);
		f2.addChild(h2, 1);		
		t.addChild(r, 1);
		t.addChild(root2, 1);		
		h2.addChild(f2, 1);
		h2.addChild(k2, 1);
		h2.addChild(i2, 3);		
		i2.addChild(d2, 1);
		i2.addChild(h2, 1);
		i2.addChild(j2, 1);		
		j2.addChild(m2, 1);
		j2.addChild(k2, 1);
		j2.addChild(i2, 3);
		j2.addChild(l2, 3);		
		k2.addChild(goal2, 1);
		k2.addChild(h2, 1);
		k2.addChild(j2, 1);		
		l2.addChild(goal2, 1);
		l2.addChild(n2, 1);
		l2.addChild(j2, 1);		
		m2.addChild(n2, 1);
		m2.addChild(j2, 1);		
		n2.addChild(m2, 1);
		n2.addChild(l2, 3);
		n2.addChild(o, 3);		
		o.addChild(n2, 1);
		o.addChild(p, 1);		
		p.addChild(o, 3);
		p.addChild(q, 1);		
		q.addChild(p, 1);
		q.addChild(r, 1);		
		r.addChild(t, 1);
		r.addChild(q, 1);		
		goal2.addChild(k2, 1);
		goal2.addChild(l2, 3);
		
		SearchOrder order2 = new AStarSearchOrder();
		SearchProblem problem2 = new SearchProblem(order2);
		problem2.doSearch(root2);
	}
	
	
}