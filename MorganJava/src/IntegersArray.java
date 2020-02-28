import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegersArray {

	public static void main(String[] args) {

		int[] intArray = new int[] { 4, 1, 3, -23, 4, 1, 3, 4, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 41, 34, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 41, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9,
				7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2,
				1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12,
				13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34,
				2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24,
				4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1,
				34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3,
				4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7,
				5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213,
				24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1,
				34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1,
				34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1,
				34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3, 4,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 3, 12, 13, 9, 7, 5, 34, 2, 1213, 24, 4134, 1, 34, 1, 34, 1, 34, 1, 3, 4, 1, 34, 1, 34, 1, 34,
				1, 34, 1, 34, 1, 34, 1, 34, 1, 34, 1, 3

		};

		int sum = 0;

		long timeBefore = 0;
		long timeAfter = 0;

		timeBefore = System.currentTimeMillis();

		// Advanced for loop
		for (int num : intArray) {
			sum = sum + num;
		}

		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore + " " + "Advance For loop");

		System.out.println(sum);

		long timeBeforeSum = 0;
		long timeAfterSum = 0;

		timeBeforeSum = System.currentTimeMillis();

		int sumation = IntStream.of(intArray).sum();

		timeAfterSum = System.currentTimeMillis();

		System.out.println(timeAfterSum - timeBeforeSum + " " + "Java 8 sum() method");
		System.out.println(sumation);

		long timeBeforeReduce = 0;

		long timeAfterReduce = 0;

		timeBeforeReduce = System.currentTimeMillis();
		int suma = Arrays.stream(intArray).parallel().reduce(0, (a, b) -> a + b);

		timeAfterReduce = System.currentTimeMillis();

		System.out.println(timeAfterReduce - timeBeforeReduce + " " + "Java 8 reduce() method");

		System.out.println(suma);

		long timeBeforeExtSum = 0;

		long timeAfterExtSum = 0;

		timeBeforeExtSum = System.currentTimeMillis();
		System.out.println(sum(intArray, 0));

		timeAfterExtSum = System.currentTimeMillis();

		System.out.println(timeAfterExtSum - timeBeforeExtSum + " " + "Ext Sum method");

	}

	public static int sum(int[] arr, int index) {
		if (arr.length <= index) {
			return 0;
		}
		return arr[index] + sum(arr, index + 1);

	}

}
