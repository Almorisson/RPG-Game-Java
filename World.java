package game.rpg;
import java.util.*;
public class World {

		private List<Area> areas;
		
		public World(List<Area> areas){
			this.areas = areas;
		}
		
		public World(Area area){
			this.areas = new ArrayList<Area>();
			this.areas.add(area);
		}
		
		public Area getCurrentArea(String name) {
			for (Area area : areas) {
				if (area.getName().equals(name)) {
					return area;
				}
			}
			return null;
		}
		
		
		public List<Area> getAreas() {
			return areas;
		}

		public void setAreas(List<Area> areas) {
			this.areas = areas;
		}

		public void addArea(Area area){
			this.areas.add(area);
		}
		
		public void print() {
			for (Area area : areas) {
				System.out.println(area.getName());
				area.print();
				System.out.println();
			}
			

	
		}
}