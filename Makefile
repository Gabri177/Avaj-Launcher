all:
	@echo "Simulating ..."
	@sh ./Launcher.sh
	@echo "Simulation is over!"

clean:
	@find . -name "*.class" -type f -delete
	@echo "All class files are deleted successfully!"

fclean: clean
	@rm -rf "./simulation.txt"
	@rm -rf "./sources.txt"
	@echo "All class file and Simulation file are cleared!!!"

.PHONY: clean fclean