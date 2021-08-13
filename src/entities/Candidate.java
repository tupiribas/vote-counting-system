package entities;

import java.util.Objects;

public class Candidate {

	private String name;
	private Integer vote;

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public Integer getVote() {
		return vote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(name, other.name);
	}

}
